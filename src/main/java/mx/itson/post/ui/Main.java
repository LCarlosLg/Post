/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.post.ui;

//Importamos los paquetes que contienen las clases parapoder utilizarlos en nuestra clase main.
import mx.itson.post.entities.Comment;
import mx.itson.post.entities.Comment_Reply;
import mx.itson.post.entities.Post;
import mx.itson.post.entities.User;
import mx.itson.post.enums.Category;

/**
 *
 * @author Carlos
 */
public class Main {
    public static void main (String [] args){
   
      //En esta parte comenzamos a darles valores a la variable user.
        User user = new User();
        
        user.setName_user("Fernanda Valdez");
         user.setEmail("fer_val24@gmail.com");
         user.setPassword("fergg123");
         
         // En este apartado comenzamos a darle valores a la variable Post y a la variable likes y dislikes.
         Post post = new Post();
         
         post.setName_post("Minecraft");
         post.setDate("24/08/23");
         post.setCategoria(Category.VIDEOGAMES);
    post.setDesciption("El nuevo mob de minecraft es fabuloso.");
   post.setLikes(150);
   post.setDislikes(12);
        
    // En esta parte comenzamos a darle valores a la variable Comment, a la variable likes y dislikes, a la variable comment_user.
        Comment comment = new Comment();
       
        user.setComment_user("Carlos Armando");
        comment.setDate("27/08/23");
        user.setEmail_comment_user("carlosa5@gmail.com");
        comment.setDescription("No me agrada, no tiene alguna funcionalidad útil");
       comment.setLikes(8);
       comment.setDislikes(19);
        
       //En este apartado se le asignan valores a las variables: comment_reply, likes, dislikes y email_comment_reply_user.
        Comment_Reply comment_reply = new Comment_Reply();
        
        user.setComment_reply_user("Valeria");
        comment_reply.setDate("02/09/23");
        user.setEmail_comment_reply_user("valeria24@gmail.com");
        comment_reply.setDescription("En lo personal, yo pieso que el nuevo mob es muy lindo y tiene una muy buena funcionalidad");
      comment_reply.setLikes(49);
      comment_reply.setDislikes(8);
       
      // En este apartado se comienza a mostrar con el get el valor de la varible y lo mandamos a imprimir en consola.
      
        System.out.println(""+ user.getName_user() + " > " + user.getEmail());
        System.out.println("Name Post: "+ post.getName_post());
        System.out.println("Category: "+ post.getCategoria());
        System.out.println("Fecha del post: "+ post.getDate());
        System.out.println("Description: "+ post.getDesciption());
        System.out.println("Likes: " +  post.getLikes() + " Dislikes: " + post.getDislikes());
         
        System.out.println("                                              ");
        
        System.out.println("Comment");
        System.out.println(""+ user.getComment_user()+" > " + user.getEmail_comment_user());
        System.out.println("Fecha de comentario: " + comment.getDate());
        System.out.println("comment: "+ comment.getDescription());
        System.out.println("Likes: "+ comment.getLikes() + " Dislikes: "+ comment.getDislikes());
        
        System.out.println("                                              ");
        
        System.out.println("Comment_reply");
        System.out.println(""+ user.getComment_reply_user()+" > " + user.getEmail_comment_reply_user());
        System.out.println("Fecha de respuesta de comentario: " + comment_reply.getDate());
        System.out.println("comment_reply: "+ comment_reply.getDescription());
        System.out.println("Likes: "+ comment_reply.getLikes()+ " Dislikes: " + comment_reply.getDislikes());
        
        
    }
}
