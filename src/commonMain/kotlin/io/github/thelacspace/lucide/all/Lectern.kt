package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lectern") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,13.0f)
                lineTo(19.0f,13.0f)
                curveTo(19.865517f,12.999796f,20.63269f,12.442879f,20.901001f,11.62f)
                lineTo(21.958f,7.2869997f)
                curveTo(22.048708f,6.984242f,21.99095f,6.656423f,21.802233f,6.402896f)
                curveTo(21.613516f,6.149369f,21.316053f,5.999978f,21.0f,6.0f)
                lineTo(3.0f,6.0f)
                curveTo(2.683946f,5.999978f,2.3864841f,6.149369f,2.197767f,6.402896f)
                curveTo(2.00905f,6.656423f,1.9512926f,6.984242f,2.042f,7.2869997f)
                lineTo(3.1f,11.621f)
                curveTo(3.3686597f,12.443482f,4.135751f,12.999936f,5.001f,13.0f)
                lineTo(9.000999f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,22.0f)
                lineTo(15.0f,11.0f)
                curveTo(15.0f,10.447715f,14.552285f,10.0f,14.0f,10.0f)
                lineTo(10.0f,10.0f)
                curveTo(9.447715f,10.0f,9.0f,10.447715f,9.0f,11.0f)
                lineTo(9.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,22.0f)
                lineTo(6.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,6.0f)
                lineTo(18.0f,3.0f)
                curveTo(18.0f,2.4477153f,17.552284f,2.0f,17.0f,2.0f)
                lineTo(14.0f,2.0f)
            }
}

public val LucideIcons.All.LecternDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lectern: ImageVector
    @Composable get() = LecternDefinition.asImageVector()
