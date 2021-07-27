/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:31 AM
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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * This Class created for
 *
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:31 AM
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
@Table(name = "sgg_gdp_growth")
@NamedQueries({
        @NamedQuery(name = "SGGGdpGrowth.findAll", query = "SELECT p FROM SGGGdpGrowth p")})
public class SGGGdpGrowth implements Serializable
{
    private static final long serialVersionUID = -2566578164059537104L;

    @Id
    @Basic(optional = false)
    @Column(name = "gdp_growth_id")
    private Integer gdpGrowthId;

    @Basic(optional = false)
    @Column(name = "gdp_growth_year")
    private Integer gdpGrowthYear;

    @Basic(optional = false)
    @Column(name = "gdp_growth_value")
    private String gdpGrowthValue;

    @Basic(optional = false)
    @Column(name = "gdp_growth_country_alpha_3", length = 3)
    private String gdpGrowthCountryAlpha3;

//    @Basic(optional = false)
//    @Column(name = "gdp_growth_country")
//    @JoinColumn(name="country_id", nullable=false)
//    private SGGCountry country;

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SGGGdpGrowth that = (SGGGdpGrowth) o;

        if (gdpGrowthId != null ? !gdpGrowthId.equals(that.gdpGrowthId) : that.gdpGrowthId != null) return false;
        if (gdpGrowthYear != null ? !gdpGrowthYear.equals(that.gdpGrowthYear) : that.gdpGrowthYear != null)
            return false;
        return gdpGrowthValue != null ? gdpGrowthValue.equals(that.gdpGrowthValue) : that.gdpGrowthValue == null;
    }

    @Override
    public int hashCode()
    {
        int result = gdpGrowthId != null ? gdpGrowthId.hashCode() : 0;
        result = 31 * result + (gdpGrowthYear != null ? gdpGrowthYear.hashCode() : 0);
        result = 31 * result + (gdpGrowthValue != null ? gdpGrowthValue.hashCode() : 0);
        return result;
    }
}
