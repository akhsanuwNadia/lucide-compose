package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Trophy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,14.66f)
                lineTo(10.0f,17.0f)
                curveTo(10.0f,17.552284f,9.552285f,18.0f,9.0f,18.0f)
                curveTo(7.8954306f,18.0f,7.0f,18.89543f,7.0f,20.0f)
                lineTo(7.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,14.66f)
                lineTo(14.0f,17.0f)
                curveTo(14.0f,17.552284f,14.447715f,18.0f,15.0f,18.0f)
                curveTo(16.10457f,18.0f,17.0f,18.89543f,17.0f,20.0f)
                lineTo(17.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.916f,10.0f)
                lineTo(19.5f,10.0f)
                curveTo(20.880713f,10.0f,22.0f,8.880712f,22.0f,7.5f)
                lineTo(22.0f,5.0f)
                curveTo(22.0f,4.4477153f,21.552284f,4.0f,21.0f,4.0f)
                lineTo(18.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,22.0f)
                lineTo(20.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,9.0f)
                curveTo(6.0147724f,12.303234f,8.6967325f,14.9732275f,12.0f,14.9732275f)
                curveTo(15.3032675f,14.9732275f,17.985228f,12.303234f,18.0f,9.0f)
                lineTo(18.0f,3.0f)
                curveTo(18.0f,2.4477153f,17.552284f,2.0f,17.0f,2.0f)
                lineTo(7.0f,2.0f)
                curveTo(6.4477153f,2.0f,6.0f,2.4477153f,6.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.084f,10.0f)
                lineTo(4.5f,10.0f)
                curveTo(3.1192882f,10.0f,2.0f,8.880712f,2.0f,7.5f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,4.4477153f,2.4477153f,4.0f,3.0f,4.0f)
                lineTo(6.0f,4.0f)
            }
}

public val LucideIcons.All.TrophyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Trophy: ImageVector
    @Composable get() = TrophyDefinition.asImageVector()
