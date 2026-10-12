package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Skull") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.5f,17.0f)
                lineTo(12.0f,16.0f)
                lineTo(11.5f,17.0f)
                lineTo(12.5f,17.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,22.0f)
                curveTo(15.552285f,22.0f,16.0f,21.552284f,16.0f,21.0f)
                lineTo(16.0f,20.0f)
                curveTo(16.768726f,19.99952f,17.469145f,19.558487f,17.801796f,18.865461f)
                curveTo(18.134447f,18.172438f,18.040453f,17.350086f,17.56f,16.75f)
                curveTo(19.904284f,14.483998f,20.638857f,11.02204f,19.416758f,7.9993076f)
                curveTo(18.19466f,4.9765754f,15.260434f,2.997922f,12.0f,2.997922f)
                curveTo(8.739565f,2.997922f,5.805339f,4.9765754f,4.5832405f,7.9993076f)
                curveTo(3.3611424f,11.02204f,4.095715f,14.483998f,6.4399996f,16.75f)
                curveTo(5.9595456f,17.350086f,5.865551f,18.172438f,6.1982026f,18.865463f)
                curveTo(6.530854f,19.558487f,7.231274f,19.99952f,8.0f,20.0f)
                lineTo(8.0f,21.0f)
                curveTo(8.0f,21.552284f,8.447715f,22.0f,9.0f,22.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                curveTo(13.998398f,12.358331f,14.188645f,12.69013f,14.498705f,12.86976f)
                curveTo(14.8087635f,13.04939f,15.1912365f,13.04939f,15.501295f,12.86976f)
                curveTo(15.811355f,12.69013f,16.001602f,12.358331f,16.0f,12.0f)
                curveTo(16.001602f,11.641669f,15.811355f,11.30987f,15.501295f,11.13024f)
                curveTo(15.1912365f,10.95061f,14.8087635f,10.95061f,14.498705f,11.13024f)
                curveTo(14.188645f,11.30987f,13.998398f,11.641669f,14.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                curveTo(7.9983974f,12.358331f,8.188645f,12.69013f,8.498705f,12.86976f)
                curveTo(8.8087635f,13.04939f,9.1912365f,13.04939f,9.501295f,12.86976f)
                curveTo(9.811355f,12.69013f,10.001602f,12.358331f,10.0f,12.0f)
                curveTo(10.001602f,11.641669f,9.811355f,11.30987f,9.501295f,11.13024f)
                curveTo(9.1912365f,10.95061f,8.8087635f,10.95061f,8.498705f,11.13024f)
                curveTo(8.188645f,11.30987f,7.9983974f,11.641669f,8.0f,12.0f)
            }
}

public val LucideIcons.All.SkullDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Skull: ImageVector
    @Composable get() = SkullDefinition.asImageVector()
