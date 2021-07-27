/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:30 AM
 */
package com.slmora.samplegdpgrowth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

/**
 * This Class created for
 *
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:30 AM
 * <p>
 * Version      Date            Editor              Note
 * ----------------------------------------------------------------------------------------------------------------
 * 1.0          7/27/2021      SLMORA                Initial Code
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "sgg_country")
@NamedQueries({
        @NamedQuery(name = "SGGCountry.findAll", query = "SELECT p FROM SGGCountry p")})
public class SGGCountry implements Serializable
{
    private static final long serialVersionUID = -9099353881366647993L;

    @Id
    @Basic(optional = false)
    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "country_name", length = 100)
    private String countryName;

    @Column(name = "country_alpha_2", length = 2)
    private String countryAlpha2;

    @Basic(optional = false)
    @Column(name = "country_alpha_3", length = 3)
    private String countryAlpha3;

    @Column(name = "country_numeric")
    private String countryNumeric;

    @OneToMany(mappedBy = "country")
    private Set<SGGGdpGrowth> gdpGrowths;

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SGGCountry that = (SGGCountry) o;

        if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null) return false;
        if (countryName != null ? !countryName.equals(that.countryName) : that.countryName != null) return false;
        if (countryAlpha2 != null ? !countryAlpha2.equals(that.countryAlpha2) : that.countryAlpha2 != null)
            return false;
        if (countryAlpha3 != null ? !countryAlpha3.equals(that.countryAlpha3) : that.countryAlpha3 != null)
            return false;
        return countryNumeric != null ? countryNumeric.equals(that.countryNumeric) : that.countryNumeric == null;
    }

    @Override
    public int hashCode()
    {
        int result = countryId != null ? countryId.hashCode() : 0;
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        result = 31 * result + (countryAlpha2 != null ? countryAlpha2.hashCode() : 0);
        result = 31 * result + (countryAlpha3 != null ? countryAlpha3.hashCode() : 0);
        result = 31 * result + (countryNumeric != null ? countryNumeric.hashCode() : 0);
        return result;
    }
}
