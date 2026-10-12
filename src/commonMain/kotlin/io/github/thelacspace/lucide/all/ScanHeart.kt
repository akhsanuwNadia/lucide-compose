package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScanHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,3.0f)
                lineTo(19.0f,3.0f)
                curveTo(20.10457f,3.0f,21.0f,3.8954306f,21.0f,5.0f)
                lineTo(21.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,17.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
                lineTo(17.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,7.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,3.8954306f,3.8954306f,3.0f,5.0f,3.0f)
                lineTo(7.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.828f,13.07f)
                curveTo(6.7139626f,11.904677f,6.7201104f,10.067244f,7.841921f,8.909402f)
                curveTo(8.963731f,7.7515607f,10.800053f,7.687347f,12.0f,8.764f)
                curveTo(13.199946f,7.687341f,15.036273f,7.751552f,16.158085f,8.909396f)
                curveTo(17.279898f,10.06724f,17.286043f,11.904678f,16.172f,13.07f)
                lineTo(12.725f,16.689999f)
                curveTo(12.536236f,16.88841f,12.27436f,17.000725f,12.0005f,17.000725f)
                curveTo(11.726641f,17.000725f,11.464765f,16.88841f,11.276f,16.689999f)
                close()
            }
}

public val LucideIcons.All.ScanHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScanHeart: ImageVector
    @Composable get() = ScanHeartDefinition.asImageVector()
