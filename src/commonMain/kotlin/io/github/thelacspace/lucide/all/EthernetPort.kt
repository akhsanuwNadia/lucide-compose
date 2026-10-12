package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EthernetPort") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,8.0f)
                lineTo(10.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,8.0f)
                lineTo(14.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,8.0f)
                lineTo(18.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,17.0f)
                curveTo(18.261232f,16.999926f,17.58259f,17.407112f,17.235f,18.059f)
                lineTo(16.765001f,18.941f)
                curveTo(16.417412f,19.592888f,15.738768f,20.000074f,15.0f,20.0f)
                lineTo(9.0f,20.0f)
                curveTo(8.261232f,20.000074f,7.58259f,19.592888f,7.235f,18.941f)
                lineTo(6.7650003f,18.059f)
                curveTo(6.4174104f,17.407112f,5.7387676f,16.999926f,5.0f,17.0f)
                lineTo(4.0f,17.0f)
                curveTo(2.8954306f,17.0f,2.0f,16.10457f,2.0f,15.0f)
                lineTo(2.0f,6.0f)
                curveTo(2.0f,4.8954306f,2.8954306f,4.0f,4.0f,4.0f)
                lineTo(20.0f,4.0f)
                curveTo(21.10457f,4.0f,22.0f,4.8954306f,22.0f,6.0f)
                lineTo(22.0f,15.0f)
                curveTo(22.0f,16.10457f,21.10457f,17.0f,20.0f,17.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,8.0f)
                lineTo(6.0f,9.0f)
            }
}

public val LucideIcons.All.EthernetPortDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EthernetPort: ImageVector
    @Composable get() = EthernetPortDefinition.asImageVector()
