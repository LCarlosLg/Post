/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.post.entities;


import mx.itson.post.enums.Category;


/**
 *
 * @author Carlos
 */
public class Post {
// comenzamos a declarar variables, y despues usamos el refactor para encapsular y definir niveles de visibilidad.
      private String name_post;
    private String desciption;
    private User user;
    private Category categoria;
    private Comment comment;
    private int likes;
    private int dislikes;
    private String date;
    
    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
     
    /**
     * @return the likes
     */
    public int getLikes() {
        return likes;
    }

    /**
     * @param likes the likes to set
     */
    public void setLikes(int likes) {
        this.likes = likes;
    }

    /**
     * @return the dislikes
     */
    public int getDislikes() {
        return dislikes;
    }

    /**
     * @param dislikes the dislikes to set
     */
    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }
    /**
     * @return the name_post
     */
    public String getName_post() {
        return name_post;
    }

    /**
     * @param name_post the name_post to set
     */
    public void setName_post(String name_post) {
        this.name_post = name_post;
    }

    /**
     * @return the desciption
     */
    public String getDesciption() {
        return desciption;
    }

    /**
     * @param desciption the desciption to set
     */
    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the categoria
     */
    public Category getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Category categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the comment
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    private static class Day {

       
       
    }
 
}
