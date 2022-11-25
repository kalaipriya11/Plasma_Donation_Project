/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plasma.donation;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author intel
 */
@Entity
@Table(name = "DON", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Don.findAll", query = "SELECT d FROM Don d")
    , @NamedQuery(name = "Don.findByOname", query = "SELECT d FROM Don d WHERE d.oname = :oname")
    , @NamedQuery(name = "Don.findByOid", query = "SELECT d FROM Don d WHERE d.oid = :oid")
    , @NamedQuery(name = "Don.findByOage", query = "SELECT d FROM Don d WHERE d.oage = :oage")
    , @NamedQuery(name = "Don.findByOgender", query = "SELECT d FROM Don d WHERE d.ogender = :ogender")
    , @NamedQuery(name = "Don.findByOcontno", query = "SELECT d FROM Don d WHERE d.ocontno = :ocontno")
    , @NamedQuery(name = "Don.findByOmailid", query = "SELECT d FROM Don d WHERE d.omailid = :omailid")
    , @NamedQuery(name = "Don.findByObloodgrp", query = "SELECT d FROM Don d WHERE d.obloodgrp = :obloodgrp")
    , @NamedQuery(name = "Don.findByOaddress", query = "SELECT d FROM Don d WHERE d.oaddress = :oaddress")
    , @NamedQuery(name = "Don.findByOdate", query = "SELECT d FROM Don d WHERE d.odate = :odate")})
public class Don implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ONAME")
    private String oname;
    @Id
    @Basic(optional = false)
    @Column(name = "OID")
    private String oid;
    @Column(name = "OAGE")
    private BigInteger oage;
    @Basic(optional = false)
    @Column(name = "OGENDER")
    private String ogender;
    @Column(name = "OCONTNO")
    private BigInteger ocontno;
    @Basic(optional = false)
    @Column(name = "OMAILID")
    private String omailid;
    @Basic(optional = false)
    @Column(name = "OBLOODGRP")
    private String obloodgrp;
    @Basic(optional = false)
    @Column(name = "OADDRESS")
    private String oaddress;
    @Column(name = "ODATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date odate;

    public Don() {
    }

    public Don(String oid) {
        this.oid = oid;
    }

    public Don(String oid, String oname, String ogender, String omailid, String obloodgrp, String oaddress) {
        this.oid = oid;
        this.oname = oname;
        this.ogender = ogender;
        this.omailid = omailid;
        this.obloodgrp = obloodgrp;
        this.oaddress = oaddress;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        String oldOname = this.oname;
        this.oname = oname;
        changeSupport.firePropertyChange("oname", oldOname, oname);
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        String oldOid = this.oid;
        this.oid = oid;
        changeSupport.firePropertyChange("oid", oldOid, oid);
    }

    public BigInteger getOage() {
        return oage;
    }

    public void setOage(BigInteger oage) {
        BigInteger oldOage = this.oage;
        this.oage = oage;
        changeSupport.firePropertyChange("oage", oldOage, oage);
    }

    public String getOgender() {
        return ogender;
    }

    public void setOgender(String ogender) {
        String oldOgender = this.ogender;
        this.ogender = ogender;
        changeSupport.firePropertyChange("ogender", oldOgender, ogender);
    }

    public BigInteger getOcontno() {
        return ocontno;
    }

    public void setOcontno(BigInteger ocontno) {
        BigInteger oldOcontno = this.ocontno;
        this.ocontno = ocontno;
        changeSupport.firePropertyChange("ocontno", oldOcontno, ocontno);
    }

    public String getOmailid() {
        return omailid;
    }

    public void setOmailid(String omailid) {
        String oldOmailid = this.omailid;
        this.omailid = omailid;
        changeSupport.firePropertyChange("omailid", oldOmailid, omailid);
    }

    public String getObloodgrp() {
        return obloodgrp;
    }

    public void setObloodgrp(String obloodgrp) {
        String oldObloodgrp = this.obloodgrp;
        this.obloodgrp = obloodgrp;
        changeSupport.firePropertyChange("obloodgrp", oldObloodgrp, obloodgrp);
    }

    public String getOaddress() {
        return oaddress;
    }

    public void setOaddress(String oaddress) {
        String oldOaddress = this.oaddress;
        this.oaddress = oaddress;
        changeSupport.firePropertyChange("oaddress", oldOaddress, oaddress);
    }

    public Date getOdate() {
        return odate;
    }

    public void setOdate(Date odate) {
        Date oldOdate = this.odate;
        this.odate = odate;
        changeSupport.firePropertyChange("odate", oldOdate, odate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oid != null ? oid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Don)) {
            return false;
        }
        Don other = (Don) object;
        if ((this.oid == null && other.oid != null) || (this.oid != null && !this.oid.equals(other.oid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "plasma.donation.Don[ oid=" + oid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
