package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                lineTo(4.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                lineTo(6.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.65f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(19.10457f,22.0f,20.0f,21.10457f,20.0f,20.0f)
                lineTo(20.0f,8.0f)
                curveTo(20.00157f,7.3599424f,19.747406f,6.745774f,19.294f,6.294f)
                lineTo(15.706f,2.706f)
                curveTo(15.254227f,2.2525938f,14.640058f,1.9984303f,14.0f,2.0f)
                lineTo(6.0f,2.0f)
                curveTo(4.8954306f,2.0f,4.0f,2.8954306f,4.0f,4.0f)
                lineTo(4.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,20.0f)
                curveTo(1.9967949f,20.716661f,2.3772902f,21.38026f,2.997409f,21.73952f)
                curveTo(3.617528f,22.09878f,4.382472f,22.09878f,5.0025907f,21.73952f)
                curveTo(5.6227098f,21.38026f,6.003205f,20.716661f,6.0f,20.0f)
                curveTo(6.003205f,19.283339f,5.6227098f,18.61974f,5.0025907f,18.26048f)
                curveTo(4.382472f,17.90122f,3.617528f,17.90122f,2.997409f,18.26048f)
                curveTo(2.3772902f,18.61974f,1.9967949f,19.283339f,2.0f,20.0f)
            }
}

public val LucideIcons.All.FileKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileKey: ImageVector
    @Composable get() = FileKeyDefinition.asImageVector()
