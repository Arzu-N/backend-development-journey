public class TicketSystem {
    Movie[]movies;
    static int totalCount=0;
    TicketSystem(Movie[]movies){
        this.movies=movies;
    }

    void buy(String name,int count){
    for(int i=0;i<movies.length;i++){
        if(name.equalsIgnoreCase(movies[i].movieName)){
            if(movies[i].buyTicket(count)){
                movies[i].ticketCount=movies[i].ticketCount-count;
                totalCount+=count;
        }}
    }
}
void printTickets(){
        for(Movie m:movies){
            System.out.println(m.movieName+" "+m.ticketCount);
        }
    System.out.println("totalCount: "+totalCount);
}
}
