package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Unlink") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.84f,12.25f)
                lineTo(20.56f,10.54f)
                lineTo(20.539999f,10.54f)
                curveTo(22.456947f,8.553653f,22.403254f,5.390148f,20.419998f,3.4699998f)
                curveTo(18.480755f,1.5998517f,15.409242f,1.5998517f,13.469998f,3.4699998f)
                lineTo(11.749998f,5.18f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.17f,11.75f)
                lineTo(3.46f,13.46f)
                curveTo(1.5430509f,15.446347f,1.5967454f,18.609852f,3.58f,20.53f)
                curveTo(5.5192432f,22.400148f,8.590756f,22.400148f,10.53f,20.53f)
                lineTo(12.24f,18.82f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,2.0f)
                lineTo(8.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,8.0f)
                lineTo(5.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,19.0f)
                lineTo(16.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,16.0f)
                lineTo(22.0f,16.0f)
            }
}

public val LucideIcons.All.UnlinkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Unlink: ImageVector
    @Composable get() = UnlinkDefinition.asImageVector()
