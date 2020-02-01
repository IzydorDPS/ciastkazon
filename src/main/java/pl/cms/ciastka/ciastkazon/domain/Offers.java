package pl.cms.ciastka.ciastkazon.domain;

import pl.cms.ciastka.ciastkazon.domain.audit.DateAudit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Offers extends DateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String imageUrl;
    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotBlank
    private String extendedDescription;
    private double xloc;
    private double yloc;
    
    private Category category;

    private double price;
    private double amount;

    public Offers() {
    }

    public double getXloc() {
        return xloc;
    }

    public void setXloc(double xloc) {
        this.xloc = xloc;
    }

    public double getYloc() {
        return yloc;
    }

    public void setYloc(double yloc) {
        this.yloc = yloc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtendedDescription() {
        return extendedDescription;
    }

    public void setExtendedDescription(String extendedDescription) {
        this.extendedDescription = extendedDescription;
    }

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}


}
