package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Drama") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,11.0f)
                lineTo(10.01f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,6.0f)
                lineTo(14.01f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,6.0f)
                lineTo(18.01f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5f,13.1f)
                lineTo(6.51f,13.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,5.0f)
                curveTo(22.0f,14.0f,18.0f,17.0f,16.0f,17.0f)
                curveTo(14.0f,17.0f,10.0f,14.0f,10.0f,5.0f)
                curveTo(10.0f,3.0f,12.0f,2.0f,16.0f,2.0f)
                curveTo(20.0f,2.0f,22.0f,3.0f,22.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.4f,9.9f)
                curveTo(16.6f,10.7f,15.4f,10.7f,14.599999f,9.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.1f,7.1f)
                curveTo(9.0f,7.2f,7.7f,7.7f,6.0f,8.6f)
                curveTo(2.5f,10.6f,1.3000002f,12.5f,2.3f,14.200001f)
                curveTo(6.8f,22.0f,11.8f,22.6f,13.5f,21.6f)
                curveTo(14.4f,21.1f,15.4f,19.5f,15.4f,16.900002f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.1f,16.5f)
                curveTo(9.400001f,15.4f,10.5f,14.8f,11.5f,15.1f)
            }
}

public val LucideIcons.All.DramaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Drama: ImageVector
    @Composable get() = DramaDefinition.asImageVector()
