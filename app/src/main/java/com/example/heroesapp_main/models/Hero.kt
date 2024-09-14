package com.example.heroesapp_main.models

data class Hero(
    val id: Int,
    val name: String,
    val description: String,
    val image: String,
    val publisherId: Int
) {
    companion object {
        val heroes = listOf(
            // Héroes de Marvel (publisherId = 1)
            Hero(1, "Iron Man", "Genius billionaire", "https://i.pinimg.com/originals/63/59/b2/6359b264b0541a92bf61d60ac82ac277.png", 1),
            Hero(2, "Doctor Strange", "Master of mystic arts", "https://www.pngall.com/wp-content/uploads/11/Doctor-Strange-PNG-Clipart.png", 1),
            Hero(3, "Captain America", "Super soldier", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngwing.com%2Fes%2Fsearch%3Fq%3DCapitan%2BAmerica&psig=AOvVaw3oUL9g1iMUexf0Yh1SQsgD&ust=1726392858938000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCKCe3tqQwogDFQAAAAAdAAAAABAE", 1),
            Hero(4, "Thor", "God of Thunder", "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/3a1b02a9-0ca7-4130-810e-c6db42004a20/d8knlef-e3e3c238-6ccb-417e-9466-065c48d396fd.png/v1/fill/w_600,h_950/thor_from_marvel_s_the_avengers_aou_png_render_by_joaohbd_d8knlef-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9OTUwIiwicGF0aCI6IlwvZlwvM2ExYjAyYTktMGNhNy00MTMwLTgxMGUtYzZkYjQyMDA0YTIwXC9kOGtubGVmLWUzZTNjMjM4LTZjY2ItNDE3ZS05NDY2LTA2NWM0OGQzOTZmZC5wbmciLCJ3aWR0aCI6Ijw9NjAwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.WA8mz52i9q29mGwUmyTr4VH1p05_AGo8eWjwOMkqgTs", 1),
            Hero(5, "Spider-Man", "Friendly neighborhood superhero", "https://www.lacapital.com.mx/files/news/SPIDERMAN.png", 1),

            // Héroes de DC (publisherId = 2)
            Hero(6, "Batman", "Dark Knight", "https://w7.pngwing.com/pngs/595/214/png-transparent-batman-the-dark-knight-returns-batsuit-the-dark-knight-trilogy-costume-batman-thumbnail.png", 2),
            Hero(7, "Wonder Woman", "Amazonian warrior", "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5b8d2b12-21e8-4931-8a6d-fb9ecdd60383/dfuwirz-7837eed9-c08f-4cb1-b543-d8bd4e298ce4.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzViOGQyYjEyLTIxZTgtNDkzMS04YTZkLWZiOWVjZGQ2MDM4M1wvZGZ1d2lyei03ODM3ZWVkOS1jMDhmLTRjYjEtYjU0My1kOGJkNGUyOThjZTQucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.1R38hvDjDk7JgPlDIhN4MtKj7Sgsyc99W97-_kTXjHs", 2),
            Hero(8, "Flash", "Fastest man alive", "https://e7.pngegg.com/pngimages/599/91/png-clipart-the-flash-illustration-the-flash-t-shirt-wally-west-comic-book-flash-comics-superhero-thumbnail.png", 2),
            Hero(9, "Victor Stone", "Cyborg", "https://comicvine.gamespot.com/a/uploads/original/11142/111427220/8042812-cyborginjustice2.png", 2),
            Hero(10, "Detective Marciano", "Martian warrior", "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/c0342b9c-fccb-4623-9744-e72f7780aac9/dhqitxx-b0fc1b05-240e-4a29-b3fd-70c027ff0553.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2MwMzQyYjljLWZjY2ItNDYyMy05NzQ0LWU3MmY3NzgwYWFjOVwvZGhxaXR4eC1iMGZjMWIwNS0yNDBlLTRhMjktYjNmZC03MGMwMjdmZjA1NTMucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.yV_1yLVMfoTrN2IreprRKCSMfGJHyNuxeRUhgq7MkYU", 2)
        )
    }
}
