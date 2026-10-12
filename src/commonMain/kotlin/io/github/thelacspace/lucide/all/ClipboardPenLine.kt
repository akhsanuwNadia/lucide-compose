package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClipboardPenLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(15.0f,2.0f)
                lineTo(16.0f,2.0f)
                lineTo(16.0f,6.0f)
                lineTo(15.0f,6.0f)
                lineTo(9.0f,6.0f)
                lineTo(8.0f,6.0f)
                lineTo(8.0f,2.0f)
                lineTo(9.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,4.0f)
                lineTo(6.0f,4.0f)
                curveTo(4.8954306f,4.0f,4.0f,4.8954306f,4.0f,6.0f)
                lineTo(4.0f,20.0f)
                curveTo(4.0f,21.10457f,4.8954306f,22.0f,6.0f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(19.10457f,22.0f,20.0f,21.10457f,20.0f,20.0f)
                lineTo(20.0f,19.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,4.0f)
                lineTo(18.0f,4.0f)
                curveTo(18.713799f,4.0007324f,19.3731f,4.381832f,19.73f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,18.0f)
                lineTo(9.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.378f,12.626f)
                curveTo(22.201212f,11.795393f,22.198215f,10.455621f,21.371298f,9.628703f)
                curveTo(20.54438f,8.8017845f,19.204609f,8.798789f,18.374f,9.622001f)
                lineTo(14.364f,13.634001f)
                curveTo(14.126247f,13.871623f,13.952221f,14.165336f,13.858001f,14.488001f)
                lineTo(13.021001f,17.358002f)
                curveTo(12.969882f,17.533266f,13.0183525f,17.72246f,13.147447f,17.851555f)
                curveTo(13.276542f,17.98065f,13.465735f,18.029121f,13.641001f,17.978003f)
                lineTo(16.511002f,17.141003f)
                curveTo(16.833668f,17.046782f,17.12738f,16.872755f,17.365002f,16.635002f)
                close()
            }
}

public val LucideIcons.All.ClipboardPenLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClipboardPenLine: ImageVector
    @Composable get() = ClipboardPenLineDefinition.asImageVector()
