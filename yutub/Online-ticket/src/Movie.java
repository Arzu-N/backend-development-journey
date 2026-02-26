public class Movie {
    String movieName;
    int ticketCount;

    Movie(String movieName,int ticketCount){
        this.movieName=movieName;
        this.ticketCount=ticketCount;
    }
    public boolean buyTicket(int count){
        if(ticketCount>=count){

            return true;
        }
        return false;
    }
}
