package com.project;

import java.util.*;
// online movie ticket management system

public class App {

    public static void main(String[] args) {
        boolean is_running = true;
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<genre_wise_movie> movies = new ArrayList<>();

            while (is_running) {
                int movie_id_remove, ticket_count;
                char cond;
                String nx = "\n";
                System.out.print("\t\tWelcome to the Online Movie Ticket Management System" + nx + nx);
                System.out.print("Please Choose option from below" + nx + nx);
                System.out.print("1. Show Movies" + nx);
                System.out.print("2. Add Movie" + nx);
                System.out.print("3. Remove Movie" + nx);
                System.out.print("4. Ticket" + nx);
                System.out.print("5. Exit Menu" + nx);

                System.out.print(nx + "Enter Your choice : ");
                int choice;
                while (true) {
                    try {
                        do {
                            choice = in.nextInt();
                        } while (choice > 5 || choice < 1);
                        break;
                    } catch (Exception e) {
                        in.next();
                        System.out.print("Error! Enter your Value again  : ");
                        continue;
                    }
                }
                switch (choice) {
                    case 1:
                        if (movies.isEmpty()) {
                            System.out
                                    .print("\n\tThere is no movie in the database\n\n\tReturning to Main Menu\n\n\n\n");
                        } else {
                            for (genre_wise_movie index : movies) {
                                System.out.print(nx);
                                index.movie_dettails_genre();
                                System.out.print(nx);
                            }
                        }
                        break;
                    case 2:
                        String movie_name;
                        String director;
                        String rating;
                        String release_date;
                        String budget;
                        String cast;
                        String duration;
                        int movie_id;
                        String genre;

                        System.out.println("\tWelcome \n\nPlease Enter Movie details below :");
                        System.out.print("Enter Movie ID = ");
                        while (true) {
                            try {
                                movie_id = in.nextInt();
                                break;
                            } catch (Exception e) {
                                in.next();
                                System.out.print("Error! Enter your Value again  : ");
                                continue;
                            }
                        }
                        in.nextLine();

                        System.out.print("Enter Movie Name = ");
                        while (true) {
                            try {
                                movie_name = in.nextLine();
                                break;
                            } catch (Exception e) {
                                in.next();
                                System.out.print("Error! Enter your Value again  : ");
                                continue;
                            }
                        }
                        System.out.print("Enter Release Date = ");
                        while (true) {
                            try {
                                release_date = in.nextLine();
                                break;
                            } catch (Exception e) {
                                // in.next();
                                System.out.print("Error! Enter your Value again  : ");
                                continue;
                            }
                        }

                        System.out.print("Enter Director = ");
                        while (true) {
                            try {
                                director = in.nextLine();
                                break;
                            } catch (Exception e) {
                                // in.next();
                                System.out.print("Error! Enter your Value again  : ");
                                continue;
                            }
                        }

                        System.out.print("Enter Cast = ");
                        while (true) {
                            try {
                                cast = in.nextLine();
                                break;
                            } catch (Exception e) {
                                // in.next();
                                System.out.print("Error! Enter your Value again  : ");
                                continue;
                            }
                        }

                        System.out.print("Enter Budget = ");
                        while (true) {
                            try {
                                budget = in.nextLine();
                                break;
                            } catch (Exception e) {
                                // in.next();
                                System.out.print("Error! Enter your Value again  : ");
                                continue;
                            }
                        }

                        System.out.print("Enter Movie Duration = ");
                        while (true) {
                            try {
                                duration = in.nextLine();
                                break;
                            } catch (Exception e) {
                                // in.next();
                                System.out.print("Error! Enter your Value again  : ");
                                continue;
                            }
                        }

                        System.out.print("Enter Movie Rating = ");
                        while (true) {
                            try {
                                rating = in.nextLine();
                                break;
                            } catch (Exception e) {
                                // in.next();
                                System.out.print("Error! Enter your Value again  : ");
                                continue;
                            }
                        }
                        System.out.print("Enter Movie Genre = ");
                        while (true) {
                            try {
                                genre = in.nextLine();
                                break;
                            } catch (Exception e) {
                                // in.next();
                                System.out.print("Error! Enter your Value again  : ");
                                continue;
                            }
                        }

                        movies.add(
                                new genre_wise_movie(movie_name, director, rating, release_date, budget, cast, duration,
                                        movie_id, genre));
                        System.out.print("Do you want to go back to the main menu ? [y/n] : ");

                        while (true) {
                            try {
                                cond = in.next().charAt(0);
                                break;
                            } catch (Exception e) {
                                // in.next();
                                System.out.print("Error! Enter your Value again : ");
                                continue;
                            }
                        }
                        if (cond == 'n') {
                            System.out.println("\nExiting Online Movie Ticket Management System...");
                            System.out.println("Have a good day...");
                            System.exit(0);
                        }
                        break;
                    case 3:
                        System.out.print("Enter the ID you want to remove from theater : ");

                        while (true) {
                            try {
                                movie_id_remove = in.nextInt();
                                break;
                            } catch (Exception e) {
                                in.next();
                                System.out.print("Error! Enter your Value again  : ");
                                continue;
                            }
                        }
                        for (Iterator<genre_wise_movie> iterator = movies.iterator(); iterator.hasNext();) {
                            genre_wise_movie movie = iterator.next();
                            if (movie_id_remove == movie.id_getter())
                                iterator.remove();
                            else
                                System.out.print("No Movie Found by this ID");

                        }
                        System.out.print("Do you want to go back to the main menu ? [y/n] : ");

                        while (true) {
                            try {
                                cond = in.next().charAt(0);
                                break;
                            } catch (Exception e) {
                                // in.next();
                                System.out.print("Error! Enter your Value again : ");
                                continue;
                            }
                        }
                        if (cond == 'n') {
                            System.out.println("\nExiting Online Movie Ticket Management System...");
                            System.out.println("Have a good day...");
                            System.exit(0);
                        }
                        break;
                    case 4:
                        System.out.print(nx + "Choose the optin from below :" + nx + nx);
                        System.out.print("1. Sell Ticket" + nx);
                        System.out.print("2. Refund Ticket" + nx);
                        System.out.print("3. Main Menu" + nx);
                        System.out.print(nx + "Enter your choice : ");
                        int pmpt_1;
                        while (true) {
                            try {
                                do {
                                    pmpt_1 = in.nextInt();
                                } while (pmpt_1 > 3 || pmpt_1 < 1);
                                break;
                            } catch (Exception e) {
                                in.next();
                                System.out.print("Error! Enter your Value again  : ");
                                continue;
                            }
                        }
                        switch (pmpt_1) {
                            case 1:
                                System.out.print("Enter the Movie ID : ");

                                while (true) {
                                    try {
                                        movie_id_remove = in.nextInt();
                                        break;
                                    } catch (Exception e) {
                                        in.next();
                                        System.out.print("Error! Enter your Value again  : ");
                                        continue;
                                    }
                                }

                                for (Iterator<genre_wise_movie> iterator = movies.iterator(); iterator.hasNext();) {
                                    genre_wise_movie movie = iterator.next();
                                    if (movie_id_remove == movie.id_getter()) {
                                        System.out.print("Enter Ticket Quantity : ");

                                        while (true) {
                                            try {
                                                ticket_count = in.nextInt();
                                                break;
                                            } catch (Exception e) {
                                                in.next();
                                                System.out.print("Error! Enter your Value again  : ");
                                                continue;
                                            }
                                        }

                                        if (ticket_count < movie.movie_seat_getter()) {
                                            movie.price_det(ticket_count);

                                        } else {
                                            System.out.print(nx + "There is no more seat for this movie" + nx);
                                        }
                                    } else
                                        System.out.print("No Movie Found by this ID");

                                }

                                System.out.print("Do you want to go back to the main menu ? [y/n] : ");

                                while (true) {
                                    try {
                                        cond = in.next().charAt(0);
                                        break;
                                    } catch (Exception e) {
                                        // in.next();
                                        System.out.print("Error! Enter your Value again : ");
                                        continue;
                                    }
                                }
                                if (cond == 'n') {
                                    System.out.println("\nExiting Online Movie Ticket Management System...");
                                    System.out.println("Have a good day...");
                                    System.exit(0);
                                }
                                break;

                            case 2:
                                System.out.print("Enter the Movie ID : ");

                                while (true) {
                                    try {
                                        movie_id_remove = in.nextInt();
                                        break;
                                    } catch (Exception e) {
                                        in.next();
                                        System.out.print("Error! Enter your Value again  : ");
                                        continue;
                                    }
                                }

                                for (Iterator<genre_wise_movie> iterator = movies.iterator(); iterator.hasNext();) {
                                    genre_wise_movie movie = iterator.next();
                                    if (movie_id_remove == movie.id_getter()) {
                                        System.out.print("Enter Ticket Quantity : ");

                                        while (true) {
                                            try {
                                                ticket_count = in.nextInt();
                                                break;
                                            } catch (Exception e) {
                                                in.next();
                                                System.out.print("Error! Enter your Value again  : ");
                                                continue;
                                            }
                                        }

                                        movie.price_ref_det(ticket_count);

                                    } else
                                        System.out.print("No Movie Found by this ID");

                                }

                                System.out.print("Do you want to go back to the main menu ? [y/n] : ");

                                while (true) {
                                    try {
                                        cond = in.next().charAt(0);
                                        break;
                                    } catch (Exception e) {
                                        // in.next();
                                        System.out.print("Error! Enter your Value again : ");
                                        continue;
                                    }
                                }
                                if (cond == 'n') {
                                    System.out.println("\nExiting Online Movie Ticket Management System...");
                                    System.out.println("Have a good day...");
                                    System.exit(0);
                                }
                                break;

                            case 3:

                                break;

                            default:
                                break;
                        }

                        break;
                    case 5:

                        System.out.println("\nExiting Online Movie Ticket Management System...");
                        System.out.println("Have a good day...");

                        System.exit(0);
                        break;
                    default:
                        break;
                }

            }

        }
    }
}
