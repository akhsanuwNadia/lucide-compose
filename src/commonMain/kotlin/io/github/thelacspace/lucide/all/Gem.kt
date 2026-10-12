package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gem") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5,3.0)
                lineTo(8.0,9.0)
                lineTo(12.0,22.0)
                lineTo(16.0,9.0)
                lineTo(13.5,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                curveTo(17.629514694213867,2.999999761581421,18.222291946411133,3.2963881492614746,18.600000381469727,3.799999952316284)
                lineTo(21.600000381469727,7.800000190734863)
                curveTo(22.128257751464844,8.50455379486084,22.133535385131836,9.471721649169922,21.613000869750977,10.182000160217285)
                lineTo(13.623001098632812,21.167999267578125)
                curveTo(13.247194290161133,21.69036102294922,12.643001556396484,21.999988555908203,11.99950122833252,21.999988555908203)
                curveTo(11.356000900268555,21.999988555908203,10.751808166503906,21.69036102294922,10.376001358032227,21.167999267578125)
                lineTo(2.3860015869140625,10.181999206542969)
                curveTo(1.8657622337341309,9.471502304077148,1.871446132659912,8.50433349609375,2.4000000953674316,7.800000190734863)
                lineTo(5.3979997634887695,3.8030002117156982)
                curveTo(5.775501728057861,3.297694206237793,6.369252681732178,3.000077486038208,7.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,9.0)
                lineTo(22.0,9.0)
            }
}

public val LucideIcons.All.GemDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gem: ImageVector
    @Composable get() = GemDefinition.asImageVector()
