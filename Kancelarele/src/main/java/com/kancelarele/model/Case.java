
package com.kancelarele.model;

import com.kancelarele.model.event.Event;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "cases")
public class Case {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String signature;
    
    @Transient
    private List <Client> clients;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventCase")
    private List <Event> events;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

   

    @Override
    public String toString() {
        return "Case{" + "id=" + id + ", signature=" + signature + ", clients=" + clients + ", events=" + events + '}';
    }
    
    
    

}
