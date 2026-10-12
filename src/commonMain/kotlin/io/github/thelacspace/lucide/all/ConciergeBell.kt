package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ConciergeBell") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,20.0)
                curveTo(2.4477152824401855,20.0,2.0,19.552284240722656,2.0,19.0)
                lineTo(2.0,18.0)
                curveTo(2.0,16.895429611206055,2.895430564880371,16.0,4.0,16.0)
                lineTo(20.0,16.0)
                curveTo(21.104570388793945,16.0,22.0,16.895429611206055,22.0,18.0)
                lineTo(22.0,19.0)
                curveTo(22.0,19.552284240722656,21.552284240722656,20.0,21.0,20.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,16.0)
                curveTo(20.012819290161133,13.133352279663086,18.4908390045166,10.478958129882812,16.01036262512207,9.04192066192627)
                curveTo(13.529888153076172,7.604883670806885,10.470111846923828,7.604883670806885,7.989636421203613,9.04192066192627)
                curveTo(5.509161472320557,10.478958129882812,3.98717999458313,13.133352279663086,4.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,4.0)
                lineTo(12.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,4.0)
                lineTo(14.0,4.0)
            }
}

public val LucideIcons.All.ConciergeBellDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ConciergeBell: ImageVector
    @Composable get() = ConciergeBellDefinition.asImageVector()
