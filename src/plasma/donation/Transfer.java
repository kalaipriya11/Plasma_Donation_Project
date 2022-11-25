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
@Table(name = "TRANSFER", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Transfer.findAll", query = "SELECT t FROM Transfer t")
    , @NamedQuery(name = "Transfer.findByRname", query = "SELECT t FROM Transfer t WHERE t.rname = :rname")
    , @NamedQuery(name = "Transfer.findByBloodgrp", query = "SELECT t FROM Transfer t WHERE t.bloodgrp = :bloodgrp")
    , @NamedQuery(name = "Transfer.findByRcontno", query = "SELECT t FROM Transfer t WHERE t.rcontno = :rcontno")
    , @NamedQuery(name = "Transfer.findByRmailid", query = "SELECT t FROM Transfer t WHERE t.rmailid = :rmailid")
    , @NamedQuery(name = "Transfer.findByAction", query = "SELECT t FROM Transfer t WHERE t.action = :action")
    , @NamedQuery(name = "Transfer.findByTdate", query = "SELECT t FROM Transfer t WHERE t.tdate = :tdate")
    , @NamedQuery(name = "Transfer.findByRid", query = "SELECT t FROM Transfer t WHERE t.rid = :rid")
    , @NamedQuery(name = "Transfer.findByOid", query = "SELECT t FROM Transfer t WHERE t.oid = :oid")})
public class Transfer implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "RNAME")
    private String rname;
    @Basic(optional = false)
    @Column(name = "BLOODGRP")
    private String bloodgrp;
    @Column(name = "RCONTNO")
    private BigInteger rcontno;
    @Basic(optional = false)
    @Column(name = "RMAILID")
    private String rmailid;
    @Basic(optional = false)
    @Column(name = "ACTION")
    private String action;
    @Column(name = "TDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tdate;
    @Id
    @Basic(optional = false)
    @Column(name = "RID")
    private String rid;
    @Column(name = "OID")
    private String oid;

    public Transfer() {
    }

    public Transfer(String rid) {
        this.rid = rid;
    }

    public Transfer(String rid, String rname, String bloodgrp, String rmailid, String action) {
        this.rid = rid;
        this.rname = rname;
        this.bloodgrp = bloodgrp;
        this.rmailid = rmailid;
        this.action = action;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        String oldRname = this.rname;
        this.rname = rname;
        changeSupport.firePropertyChange("rname", oldRname, rname);
    }

    public String getBloodgrp() {
        return bloodgrp;
    }

    public void setBloodgrp(String bloodgrp) {
        String oldBloodgrp = this.bloodgrp;
        this.bloodgrp = bloodgrp;
        changeSupport.firePropertyChange("bloodgrp", oldBloodgrp, bloodgrp);
    }

    public BigInteger getRcontno() {
        return rcontno;
    }

    public void setRcontno(BigInteger rcontno) {
        BigInteger oldRcontno = this.rcontno;
        this.rcontno = rcontno;
        changeSupport.firePropertyChange("rcontno", oldRcontno, rcontno);
    }

    public String getRmailid() {
        return rmailid;
    }

    public void setRmailid(String rmailid) {
        String oldRmailid = this.rmailid;
        this.rmailid = rmailid;
        changeSupport.firePropertyChange("rmailid", oldRmailid, rmailid);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        String oldAction = this.action;
        this.action = action;
        changeSupport.firePropertyChange("action", oldAction, action);
    }

    public Date getTdate() {
        return tdate;
    }

    public void setTdate(Date tdate) {
        Date oldTdate = this.tdate;
        this.tdate = tdate;
        changeSupport.firePropertyChange("tdate", oldTdate, tdate);
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        String oldRid = this.rid;
        this.rid = rid;
        changeSupport.firePropertyChange("rid", oldRid, rid);
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        String oldOid = this.oid;
        this.oid = oid;
        changeSupport.firePropertyChange("oid", oldOid, oid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rid != null ? rid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transfer)) {
            return false;
        }
        Transfer other = (Transfer) object;
        if ((this.rid == null && other.rid != null) || (this.rid != null && !this.rid.equals(other.rid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "plasma.donation.Transfer[ rid=" + rid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
