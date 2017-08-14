package edu.berliner.daveslist.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ad
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String rules;
    private boolean hasWifi;
    private String cable;
    private boolean hasPrivateBath;
    private boolean isRented;

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getRules()
    {
        return rules;
    }

    public void setRules(String rules)
    {
        this.rules = rules;
    }

    public boolean isHasWifi()
    {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi)
    {
        this.hasWifi = hasWifi;
    }

    public String getCable()
    {
        return cable;
    }

    public void setCable(String cable)
    {
        this.cable = cable;
    }

    public boolean isHasPrivateBath()
    {
        return hasPrivateBath;
    }

    public void setHasPrivateBath(boolean hasPrivateBath)
    {
        this.hasPrivateBath = hasPrivateBath;
    }

    public boolean isIsRented()
    {
        return isRented;
    }

    public void setIsRented(boolean rented)
    {
        isRented = rented;
    }
}
