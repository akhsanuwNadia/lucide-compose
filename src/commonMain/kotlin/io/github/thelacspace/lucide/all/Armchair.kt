package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Armchair") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,9.0)
                lineTo(19.0,6.0)
                curveTo(19.0,4.895430564880371,18.104570388793945,4.0,17.0,4.0)
                lineTo(7.0,4.0)
                curveTo(5.895430564880371,4.0,5.0,4.895430564880371,5.0,6.0)
                lineTo(5.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,16.0)
                curveTo(3.0,17.104570388793945,3.895430564880371,18.0,5.0,18.0)
                lineTo(19.0,18.0)
                curveTo(20.104570388793945,18.0,21.0,17.104570388793945,21.0,16.0)
                lineTo(21.0,11.0)
                curveTo(20.995075225830078,9.898921966552734,20.101089477539062,9.00892448425293,19.0,9.00892448425293)
                curveTo(17.898910522460938,9.00892448425293,17.004924774169922,9.898921966552734,17.0,11.0)
                lineTo(17.0,12.5)
                curveTo(17.0,12.776142120361328,16.776142120361328,13.0,16.5,13.0)
                lineTo(7.5,13.0)
                curveTo(7.223857402801514,13.0,7.0,12.776142120361328,7.0,12.5)
                lineTo(7.0,11.0)
                curveTo(6.995075702667236,9.898921966552734,6.101089000701904,9.00892448425293,5.0,9.00892448425293)
                curveTo(3.8989107608795166,9.00892448425293,3.0049242973327637,9.898921966552734,3.0,11.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,18.0)
                lineTo(5.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,18.0)
                lineTo(19.0,20.0)
            }
}

public val LucideIcons.All.ArmchairDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Armchair: ImageVector
    @Composable get() = ArmchairDefinition.asImageVector()
