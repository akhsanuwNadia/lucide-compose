package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Drill") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,18.0f)
                curveTo(10.552285f,18.0f,11.0f,18.447716f,11.0f,19.0f)
                lineTo(11.0f,21.0f)
                curveTo(11.0f,21.552284f,10.552285f,22.0f,10.0f,22.0f)
                lineTo(5.0f,22.0f)
                curveTo(3.3431458f,22.0f,2.0f,20.656855f,2.0f,19.0f)
                curveTo(2.0f,18.447716f,2.4477153f,18.0f,3.0f,18.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,10.0f)
                lineTo(4.0f,10.0f)
                curveTo(2.8954306f,10.0f,2.0f,9.104569f,2.0f,8.0f)
                lineTo(2.0f,4.0f)
                curveTo(2.0f,2.8954306f,2.8954306f,2.0f,4.0f,2.0f)
                lineTo(13.0f,2.0f)
                curveTo(13.552285f,2.0f,14.0f,2.4477153f,14.0f,3.0f)
                lineTo(14.0f,9.0f)
                curveTo(14.0f,9.552285f,13.552285f,10.0f,13.0f,10.0f)
                lineTo(12.19f,13.242001f)
                curveTo(12.078929f,13.687329f,11.67897f,13.999874f,11.219999f,14.000001f)
                lineTo(8.0f,14.000001f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,4.0f)
                lineTo(17.0f,4.0f)
                curveTo(17.552284f,4.0f,18.0f,4.4477153f,18.0f,5.0f)
                lineTo(18.0f,7.0f)
                curveTo(18.0f,7.5522847f,17.552284f,8.0f,17.0f,8.0f)
                lineTo(14.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,6.0f)
                lineTo(22.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,10.0f)
                lineTo(3.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,18.0f)
                lineTo(9.0f,10.0f)
            }
}

public val LucideIcons.All.DrillDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Drill: ImageVector
    @Composable get() = DrillDefinition.asImageVector()
