/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

    /**
     *
     * @author trwalker
     */
     /**
    02:    A country with a name and area.
    03: */
import java.util.*;

public class Country implements Comparable<Country>
    {
     /**
        Constructs a country.
      @param aName the name of the country
        @param anArea the area of the country
      */
    public Country(String aName, double anArea)
    {
      name = aName;
      area = anArea;
    }

    /**
       Gets the name of the country.
     @return the name
    */
    public String getName()
    {
     return name;
    }

     /**
      Gets the area of the country.
      @return the area
      */
    public double getArea()
    {
     return area;
    }
     /**
      Compares two countries by area.
      @param other the other country
        @return a negative number if this country has a smaller
      area than otherCountry, 0 if the areas are the same,
       a positive number otherwise
     */
    public int compareTo(Country other)
    {
      if (area < other.area) return -1;
      if (area > other.area) return 1;
      return 0;
    }
    
    public static Comparator<Country> createComparatorByName(final boolean increasing)
    {
        return new Comparator<Country>()
        {
            public int compare(Country country1, Country country2)
            {
                if(increasing)
                    return country1.getName().compareTo(country2.getName());
                else
                    // Multiply by -1 to arrange in decreasing order. //
                    return -1 * country1.getName().compareTo(country2.getName());
            }
        };
    }
    
    public static Comparator<Country> createComparatorByArea(final boolean increasing)
    {
        return new Comparator<Country>()
        {
            public int compare(Country country1, Country country2)
            {
                Double doubleOfCountry1Area = country1.getArea();
                Double doubleOfCountry2Area = country2.getArea();
                if(increasing)
                    return doubleOfCountry1Area.compareTo(doubleOfCountry2Area);
                else
                    // Multiply by -1 to arrange in decreasing order. //
                    return -1 * doubleOfCountry1Area.compareTo(doubleOfCountry2Area);
            }
        };
    }
    
    public String toString()
    {
        return "" + getName() + " " + getArea();
    }
    
 private String name;
 private double area;
  }