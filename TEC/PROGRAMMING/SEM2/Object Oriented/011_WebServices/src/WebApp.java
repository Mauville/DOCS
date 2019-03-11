import java.util.Calendar;
import java.util.Date;

public class WebApp extends Service {
    private Date releaseDate;
    private int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    @Override
    double getPrice() {
        if (releaseDate.getYear() == currentYear)
            return (basePrice / 100);
        else if (releaseDate.getYear() == currentYear - 1)
            return ((basePrice * .9) / 100);
        else
            return ((basePrice * .8) / 100);

    }

    WebApp(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
