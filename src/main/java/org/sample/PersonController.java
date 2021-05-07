package org.sample;


import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import javax.transaction.Transactional;
import javax.ws.rs.*;

@Path("/person")
public class PersonController {

    @GET
    public Multi<Person> findAll(){
        return Person.streamAll();
    }

    @GET
    @Path("{id}")
    public Uni<Person> findById(@PathParam("id") Long id){

        return Person.findById(id);
    }

    @POST
    @Transactional
    public  Person insert(Person person){
        person.id = null;
        person.persist();
        return person;
    }
}
