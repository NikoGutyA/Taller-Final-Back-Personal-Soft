package com.example.demo.models;

@Table(name= "autor")
public class UsuarioModel {

    private Long idAutor;
    private String nombreAutor;


}

	public @Table(name= get"Autor")() {
		return this."autor");
	}

	public void set"Autor")(@Table(name= "autor")) {
		this."autor") = "autor");
	}

	public class getUsuarioModel() {
		return this.UsuarioModel;
	}

	public void setUsuarioModel(class UsuarioModel) {
		this.UsuarioModel = UsuarioModel;
	}

	public Long getIdAutor() {
		return this.idAutor;
	}

	public void setIdAutor(Long idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombreAutor() {
		return this.nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

     @Table(name= "libro") {

        private Long idLibro;
        private Long idCategoria;
        private Longo idEditorial;
        private String titulo;
        private String descripcion;
        private String favorito;
     }

	public "libro") get{() {
		return this.{;
	}

	public void set{("libro") {) {
		this.{ = {;
	}

	public Long getIdLibro() {
		return this.idLibro;
	}

	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}

	public Long getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Longo getIdEditorial() {
		return this.idEditorial;
	}

	public void setIdEditorial(Longo idEditorial) {
		this.idEditorial = idEditorial;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFavorito() {
		return this.favorito;
	}

	public void setFavorito(String favorito) {
		this.favorito = favorito;
	}

	public Object get}() {
		return this.};
	}

	public void set}(Object }) {
		this.} = };
	}

    @Table(name= "autorLibro") {

        private Long idAutor;
        private Long idLibro;
    }


	public "autorLibro") get{() {
		return this.{;
	}

	public void set{("autorLibro") {) {
		this.{ = {;
	}

	public Long getIdAutor() {
		return this.idAutor;
	}

	public void setIdAutor(Long idAutor) {
		this.idAutor = idAutor;
	}

	public Long getIdLibro() {
		return this.idLibro;
	}

	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}

	public Object get}() {
		return this.};
	}

	public void set}(Object }) {
		this.} = };
	}


    @Table(name= "categotia") {

        private Long idCategoria;
        private String nombreCategoria;
    }

	public "categotia") get{() {
		return this.{;
	}

	public void set{("categotia") {) {
		this.{ = {;
	}

	public Long getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombreCategoria() {
		return this.nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public Object get}() {
		return this.};
	}

	public void set}(Object }) {
		this.} = };
	}


    @Table(name= "editorial") {

        private Long idEditorial;
        private String nombreEditorial;
    }

	public "editorial") get{() {
		return this.{;
	}

	public void set{("editorial") {) {
		this.{ = {;
	}

	public Long getIdEditorial() {
		return this.idEditorial;
	}

	public void setIdEditorial(Long idEditorial) {
		this.idEditorial = idEditorial;
	}

	public String getNombreEditorial() {
		return this.nombreEditorial;
	}

	public void setNombreEditorial(String nombreEditorial) {
		this.nombreEditorial = nombreEditorial;
	}

	public Object get}() {
		return this.};
	}

	public void set}(Object }) {
		this.} = };
	}
    
    
    @Table(name= "infoAdicional") {

        private Long idInfoAdicional;
        private Long idLibro;
        private String idioma;
        private String fechaPublicacion;
    }

	public "infoAdicional") get{() {
		return this.{;
	}

	public void set{("infoAdicional") {) {
		this.{ = {;
	}

	public Long getIdInfoAdicional() {
		return this.idInfoAdicional;
	}

	public void setIdInfoAdicional(Long idInfoAdicional) {
		this.idInfoAdicional = idInfoAdicional;
	}

	public Long getIdLibro() {
		return this.idLibro;
	}

	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}

	public String getIdioma() {
		return this.idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getFechaPublicacion() {
		return this.fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public Object get}() {
		return this.};
	}

	public void set}(Object }) {
		this.} = };
	}
