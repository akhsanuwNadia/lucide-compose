package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bridge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,9.728f)
                lineTo(10.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,9.728f)
                lineTo(14.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,20.0f)
                lineTo(18.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,11.0f)
                lineTo(18.0f,7.0f)
                curveTo(16.583591f,8.888544f,14.36068f,10.0f,12.0f,10.0f)
                curveTo(9.63932f,10.0f,7.416408f,8.888544f,6.0f,7.0f)
                lineTo(2.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,16.0f)
                lineTo(2.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,20.0f)
                lineTo(6.0f,4.0f)
            }
}

public val LucideIcons.All.BridgeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bridge: ImageVector
    @Composable get() = BridgeDefinition.asImageVector()
