package br.gov.sp.fatec.itu.music.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_MUSIC")
public class Music implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String singer;
    private String album;
    private Integer date;
    private Integer duration;

    

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    public String getAlbum() {
        return album;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getDuration() {
        return duration;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null)? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Music other = (Music) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}


