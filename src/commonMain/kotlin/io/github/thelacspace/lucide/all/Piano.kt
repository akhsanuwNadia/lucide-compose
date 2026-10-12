package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Piano") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,13.0)
                lineTo(10.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,13.0)
                lineTo(14.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,13.0)
                lineTo(18.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,13.0)
                lineTo(22.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,11.5)
                curveTo(22.0,9.56700325012207,20.43299674987793,8.0,18.5,8.0)
                curveTo(17.145648956298828,7.999268531799316,15.911832809448242,7.221571922302246,15.32699966430664,6.0)
                curveTo(13.925577163696289,3.039304494857788,10.658373832702637,1.4463611841201782,7.462717533111572,2.1657254695892334)
                curveTo(4.267061710357666,2.885089874267578,1.9975842237472534,5.7243781089782715,2.0,9.0)
                lineTo(2.0,19.0)
                curveTo(2.0,20.104570388793945,2.895430564880371,21.0,4.0,21.0)
                lineTo(20.0,21.0)
                curveTo(21.104570388793945,21.0,22.0,20.104570388793945,22.0,19.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,13.0)
                lineTo(6.0,17.0)
            }
}

public val LucideIcons.All.PianoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Piano: ImageVector
    @Composable get() = PianoDefinition.asImageVector()
