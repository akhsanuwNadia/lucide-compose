package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sofa") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,9.0)
                lineTo(20.0,6.0)
                curveTo(20.0,4.895430564880371,19.104570388793945,4.0,18.0,4.0)
                lineTo(6.0,4.0)
                curveTo(4.895430564880371,4.0,4.0,4.895430564880371,4.0,6.0)
                lineTo(4.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,16.0)
                curveTo(2.0,17.104570388793945,2.895430564880371,18.0,4.0,18.0)
                lineTo(20.0,18.0)
                curveTo(21.104570388793945,18.0,22.0,17.104570388793945,22.0,16.0)
                lineTo(22.0,11.0)
                curveTo(21.995075225830078,9.898921966552734,21.101089477539062,9.00892448425293,20.0,9.00892448425293)
                curveTo(18.898910522460938,9.00892448425293,18.004924774169922,9.898921966552734,18.0,11.0)
                lineTo(18.0,12.5)
                curveTo(18.0,12.776142120361328,17.776142120361328,13.0,17.5,13.0)
                lineTo(6.5,13.0)
                curveTo(6.223857402801514,13.0,6.0,12.776142120361328,6.0,12.5)
                lineTo(6.0,11.0)
                curveTo(5.995075702667236,9.898921966552734,5.101089000701904,9.00892448425293,4.0,9.00892448425293)
                curveTo(2.8989107608795166,9.00892448425293,2.0049242973327637,9.898921966552734,2.0,11.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,18.0)
                lineTo(4.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,18.0)
                lineTo(20.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,4.0)
                lineTo(12.0,13.0)
            }
}

public val LucideIcons.All.SofaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sofa: ImageVector
    @Composable get() = SofaDefinition.asImageVector()
