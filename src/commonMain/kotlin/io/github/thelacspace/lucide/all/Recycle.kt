package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Recycle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,19.0f)
                lineTo(4.815f,19.0f)
                curveTo(4.173413f,19.001856f,3.577712f,18.66758f,3.245f,18.119f)
                curveTo(2.9252863f,17.567686f,2.9237618f,16.88774f,3.241f,16.335f)
                lineTo(7.196f,9.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,19.0f)
                lineTo(19.203f,19.0f)
                curveTo(19.841402f,18.99506f,20.431086f,18.657774f,20.758999f,18.11f)
                curveTo(21.074226f,17.560322f,21.074226f,16.88468f,20.758999f,16.335001f)
                lineTo(19.532999f,14.215001f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,16.0f)
                lineTo(11.0f,19.0f)
                lineTo(14.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.293f,13.596f)
                lineTo(7.196f,9.5f)
                lineTo(3.1f,10.598f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.344f,5.811f)
                lineTo(10.437f,3.919f)
                curveTo(10.756233f,3.362494f,11.343581f,3.0138035f,11.985f,3.0f)
                curveTo(12.621899f,2.9988127f,13.211123f,3.3372548f,13.531f,3.888f)
                lineTo(17.474f,10.731f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.378f,9.633f)
                lineTo(17.474f,10.731001f)
                lineTo(18.571001f,6.6350007f)
            }
}

public val LucideIcons.All.RecycleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Recycle: ImageVector
    @Composable get() = RecycleDefinition.asImageVector()
