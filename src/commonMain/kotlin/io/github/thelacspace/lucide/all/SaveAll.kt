package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SaveAll") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(10.0f,5.0f)
                curveTo(10.0f,5.5522847f,10.447715f,6.0f,11.0f,6.0f)
                lineTo(16.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,18.0f)
                lineTo(18.0f,12.0f)
                curveTo(18.0f,11.447715f,17.552284f,11.0f,17.0f,11.0f)
                lineTo(11.0f,11.0f)
                curveTo(10.447715f,11.0f,10.0f,11.447715f,10.0f,12.0f)
                lineTo(10.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,22.0f)
                lineTo(4.0f,22.0f)
                curveTo(2.8954306f,22.0f,2.0f,21.10457f,2.0f,20.0f)
                lineTo(2.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,18.0f)
                curveTo(6.8954306f,18.0f,6.0f,17.10457f,6.0f,16.0f)
                lineTo(6.0f,4.0f)
                curveTo(6.0f,2.8954306f,6.8954306f,2.0f,8.0f,2.0f)
                lineTo(17.172f,2.0f)
                curveTo(17.70239f,2.0001135f,18.211016f,2.2109013f,18.586f,2.586f)
                lineTo(21.414001f,5.414f)
                curveTo(21.789099f,5.7889857f,21.999887f,6.2976108f,22.0f,6.828f)
                lineTo(22.0f,16.0f)
                curveTo(22.000006f,16.53217f,21.78792f,17.042398f,21.410683f,17.41776f)
                curveTo(21.033443f,17.793123f,20.522163f,18.00266f,19.99f,18.0f)
                close()
            }
}

public val LucideIcons.All.SaveAllDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SaveAll: ImageVector
    @Composable get() = SaveAllDefinition.asImageVector()
