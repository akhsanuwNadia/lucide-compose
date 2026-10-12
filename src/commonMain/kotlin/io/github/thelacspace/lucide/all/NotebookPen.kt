package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NotebookPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.4f,2.0f)
                lineTo(6.0f,2.0f)
                curveTo(4.8954306f,2.0f,4.0f,2.8954306f,4.0f,4.0f)
                lineTo(4.0f,20.0f)
                curveTo(4.0f,21.10457f,4.8954306f,22.0f,6.0f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(19.10457f,22.0f,20.0f,21.10457f,20.0f,20.0f)
                lineTo(20.0f,12.6f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,6.0f)
                lineTo(6.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,10.0f)
                lineTo(6.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,14.0f)
                lineTo(6.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,18.0f)
                lineTo(6.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.378f,5.626f)
                curveTo(21.918621f,5.0901937f,22.131231f,4.3060794f,21.935326f,3.5705664f)
                curveTo(21.73942f,2.8350534f,21.164948f,2.2605803f,20.429434f,2.064675f)
                curveTo(19.693922f,1.8687695f,18.909807f,2.08138f,18.374f,2.622f)
                lineTo(13.364f,7.634f)
                curveTo(13.126247f,7.8716216f,12.952221f,8.165335f,12.858001f,8.488f)
                lineTo(12.021001f,11.358f)
                curveTo(11.969882f,11.533265f,12.0183525f,11.722458f,12.147448f,11.851553f)
                curveTo(12.276543f,11.980648f,12.465735f,12.029119f,12.641001f,11.978f)
                lineTo(15.511001f,11.141f)
                curveTo(15.833666f,11.046779f,16.127378f,10.872752f,16.365f,10.635f)
                close()
            }
}

public val LucideIcons.All.NotebookPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NotebookPen: ImageVector
    @Composable get() = NotebookPenDefinition.asImageVector()
