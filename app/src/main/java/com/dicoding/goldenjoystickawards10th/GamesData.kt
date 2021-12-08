package com.dicoding.goldenjoystickawards10th

import java.util.*

object GamesData {
    private val gameNames = arrayOf(
        "Resident Evil Village",
        "The Last of Us Part II",
        "Resident Evil 2",
        "Fornite",
        "The Legend of Zelda: Breath of the Wild",
        "Dark Souls III",
        "The Witcher 3: Wild Hunt",
        "Dark Souls II",
        "Grand Theft Auto V",
        "The Elder Scrolls V: Skyrim",
        "Portal 2"
    )

    private val gameYears = arrayOf(
        "2021",
        "2020",
        "2019",
        "2018",
        "2017",
        "2016",
        "2015",
        "2014",
        "2013",
        "2012",
        "2011"
    )

    private val gameDetails = arrayOf(
        "Resident Evil Village is a 2021 survival horror game developed and published by Capcom. It is the sequel to Resident Evil 7: Biohazard (2017). Players control Ethan Winters, who is searching for his kidnapped daughter after a fateful encounter with Chris Redfield, and finds himself in a village filled with mutant creatures. While Village maintains the Resident Evil series' survival horror elements, the game adopts a more action-oriented gameplay style compared to its predecessor.",
        "The Last of Us Part II is a 2020 action-adventure game developed by Naughty Dog and published by Sony Interactive Entertainment for the PlayStation 4. Set five years after The Last of Us (2013), the game focuses on two playable characters in a post-apocalyptic United States whose lives intertwine: Ellie, who sets out for revenge after suffering a tragedy, and Abby, a soldier who becomes involved in a conflict between her militia and a religious cult. The game is played from the third-person perspective and allows the player to fight human enemies and cannibalistic zombie-like creatures with firearms, improvised weapons, and stealth.",
        "Resident Evil 2 is a 2019 survival horror game developed and published by Capcom. A remake of the 1998 game of the same name, it was released for Microsoft Windows, PlayStation 4, and Xbox One on January 25, 2019. Players control rookie police officer Leon S. Kennedy and college student Claire Redfield as they attempt to escape Raccoon City during a viral outbreak, that transforms the citizens into zombies and other creatures.",
        "Fortnite Battle Royale is a free-to-play battle royale video game developed and published by Epic Game. It is a companion game to Fortnite: Save the World, a cooperative survival game with construction elements. It was initially released in early access on September 26, 2017, for Microsoft Windows, macOS, PlayStation 4, and Xbox One, followed by ports for iOS,Android, and Nintendo Switch the following year. Epic dropped the early access label for the game on June 29, 2020. Versions for the PlayStation 5 and Xbox Series X/S were released as launch titles in late 2020.",
        "The Legend of Zelda: Breath of the Wild is a 2017 action-adventure game developed and published by Nintendo for the Nintendo Switch and Wii U consoles. Breath of the Wild is the nineteenth installment of The Legend of Zelda franchise and is set at the end of the Zelda timeline. The player controls Link, who awakens from a hundred-year slumber to defeat Calamity Ganon and restore the kingdom of Hyrule.",
        "Dark Souls III is a 2016 action role-playing video game developed by FromSoftware and published by Bandai Namco Entertainment for PlayStation 4, Xbox One, and Microsoft Windows. It is the fourth overall entry of the Souls series and the final installment of the Dark Souls trilogy. It is an action role-playing game played in a third-person perspective. Players have access to various weapons, armour, magic, and consumables that they can use to fight their enemies. Bonfires serve as checkpoints. The Estus Flask is the consumable used for healing in Dark Souls III. Ashen Estus Flasks restore focus points (FP), which can be used for magic or weapon arts. Hidetaka Miyazaki, the creator of the series, returned to direct the game after handing the development duties of Dark Souls II to others in FromSoftware.",
        "The Witcher 3: Wild Hunt is an action role-playing game developed by Polish developer CD Projekt Red, and first published in 2015. It is the sequel to the 2011 game The Witcher 2: Assassins of Kings and the third main installment in The Witcher video game series, played in an open world with a third-person perspective. The games are based on The Witcher series of fantasy novels written by Andrzej Sapkowski.",
        "Dark Souls II is an action role-playing game developed by FromSoftware and published by Bandai Namco Game. The third game in the Souls series, it was released for Microsoft Windows, PlayStation 3 and Xbox 360. Although both are set in the same universe, there is no overt story connection between the first Dark Souls and the sequel.[4] The game uses dedicated multiplayer servers.[4] Taking place in the kingdom of Drangleic, the game features both player versus environment (PvE) and player versus player (PvP) gameplay, in addition to having some co-op components. As in the earlier games in the series, it again features challenging gameplay, but with a more powerful graphics engine and more advanced artificial intelligence system.",
        "Grand Theft Auto V is a 2013 action-adventure game developed by Rockstar North and published by Rockstar Game. It is the seventh main entry in the Grand Theft Auto series, following 2008's Grand Theft Auto IV, and the fifteenth instalment overall. Set within the fictional state of San Andreas, based on Southern California, the single-player story follows three protagonists—retired bank robber Michael De Santa, street gangster Franklin Clinton, and drug dealer and gunrunner Trevor Philips—and their attempts to commit heists while under pressure from a corrupt government agency and powerful criminals. The open world design lets players freely roam San Andreas' open countryside and the fictional city of Los Santos, based on Los Angeles.",
        "The Elder Scrolls V: Skyrim is an open-world action role-playing video game developed by Bethesda Game Studios and published by Bethesda Softworks. It is the fifth main installment in the Elder Scrolls series, following 2006's The Elder Scrolls IV: Oblivion, and was released worldwide for Microsoft Windows, PlayStation 3, and Xbox 360 on November 11, 2011. The game's main story revolves around the player's character, the Dragonborn, on their quest to defeat Alduin the World-Eater, a dragon who is prophesied to destroy the world. The game is set 200 years after the events of Oblivion and takes place in Skyrim, the northernmost province of Tamriel. Over the course of the game, the player completes quests and develops the character by improving skills. The game continues the open-world tradition of its predecessors by allowing the player to travel anywhere in the game world at any time, and to ignore or postpone the main storyline indefinitely.",
        "Portal 2 is a 2011 puzzle-platform video game developed by Valve for Windows, Mac OS X, Linux, PlayStation 3, and Xbox 360. The digital PC version is distributed online by Valve's Steam service, while all retail editions were distributed by Electronic Arts. Like the original Portal (2007), players solve puzzles by placing portals and teleporting between them. Portal 2 adds features including tractor beams, lasers, light bridges, and paint-like gels that alter player movement or allow portals to be placed on any surface. In the single-player campaign, players control Chell, who navigates the dilapidated Aperture Science Enrichment Center during its reconstruction by the supercomputer GLaDOS (Ellen McLain); new characters include robot Wheatley (Stephen Merchant) and Aperture founder Cave Johnson (J. K. Simmons). In the new cooperative mode, players solve puzzles together as robots Atlas and P-Body (both voiced by Dee Bradley Baker). Jonathan Coulton and the National produced songs for the game."
    )

    private val gameImages = intArrayOf(
        R.drawable.re_village,
        R.drawable.tlou2,
        R.drawable.re2,
        R.drawable.fortnite,
        R.drawable.zelda,
        R.drawable.dark_soul_iii,
        R.drawable.witcher3,
        R.drawable.dark_soul_ii,
        R.drawable.gtav,
        R.drawable.skyrim,
        R.drawable.portal2
    )

    val listGames: ArrayList<Game>
        get() {
            val list = arrayListOf<Game>()
            for (position in gameNames.indices) {
                val game = Game()
                game.name = gameNames[position]
                game.year = gameYears[position]
                game.detail = gameDetails[position]
                game.photo = gameImages[position]
                list.add(game)
            }
            return list
        }
}