package br.com.felipemusic.model;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "musicas")
public class Musica {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter
    @Setter
    @Size(min = 2, max = 50)
    @Column(nullable = false, length = 50)
    private String titulo;

    @Getter
    @Setter
    @Size(min = 2, max = 50)
    @Column(nullable = false, length = 50)
    private String banda;

    @Getter
    @Setter
    @Range(min = 0, max = 10)
    @Column(nullable = false)
    private int nota;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_playlist_fk")
    private Playlist playlist;



}
