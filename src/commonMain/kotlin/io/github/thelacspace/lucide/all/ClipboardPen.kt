package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClipboardPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,4.0f)
                lineTo(18.0f,4.0f)
                curveTo(19.10457f,4.0f,20.0f,4.8954306f,20.0f,6.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.34f,15.664f)
                curveTo(21.880621f,15.128194f,22.093231f,14.344079f,21.897326f,13.608566f)
                curveTo(21.70142f,12.873054f,21.126947f,12.29858f,20.391434f,12.1026745f)
                curveTo(19.65592f,11.90677f,18.871807f,12.11938f,18.336f,12.66f)
                lineTo(13.326f,17.672f)
                curveTo(13.088247f,17.909622f,12.914221f,18.203335f,12.820001f,18.526001f)
                lineTo(11.983001f,21.396f)
                curveTo(11.931882f,21.571264f,11.980352f,21.760458f,12.109447f,21.889553f)
                curveTo(12.238542f,22.018648f,12.427735f,22.06712f,12.603001f,22.016f)
                lineTo(15.473001f,21.179f)
                curveTo(15.795666f,21.08478f,16.089378f,20.910753f,16.327f,20.673f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(4.8954306f,22.0f,4.0f,21.10457f,4.0f,20.0f)
                lineTo(4.0f,6.0f)
                curveTo(4.0f,4.8954306f,4.8954306f,4.0f,6.0f,4.0f)
                lineTo(8.0f,4.0f)
            }
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
}

public val LucideIcons.All.ClipboardPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClipboardPen: ImageVector
    @Composable get() = ClipboardPenDefinition.asImageVector()
