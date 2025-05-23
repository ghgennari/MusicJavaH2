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
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    
    

}
