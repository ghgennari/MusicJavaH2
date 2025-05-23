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
    private Integer year;
    private Integer duration;

    //Id
    public long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    //Title
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    //singer
    public String getsinger(){
        return singer;
    }
    public void setsinger(String singer){
        this.singer = singer;
    }
    //Album
    public String getAlbum(){
        return album;
    }
    public void setAlbum(String album){
        this.album = album;
    }
    //Year
    public Integer getYear(){
        return year;
    }
    public void setyear(Integer year){
        this.year = year;
    }
    //duration
    public Integer getDuration(){
        return duration;
    }
    public void setDuration(Integer duration){
        this.duration = duration;
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
