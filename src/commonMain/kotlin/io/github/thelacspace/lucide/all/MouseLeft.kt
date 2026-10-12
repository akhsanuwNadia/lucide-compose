package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MouseLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,7.318f)
                lineTo(12.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,10.0f)
                lineTo(5.0f,15.0f)
                curveTo(5.017235f,18.853773f,8.146188f,21.968765f,12.0f,21.968765f)
                curveTo(15.853812f,21.968765f,18.982765f,18.853773f,19.0f,15.0f)
                lineTo(19.0f,9.0f)
                curveTo(19.0f,5.473f,16.392f,2.4850001f,13.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,4.0f)
                curveTo(4.996795f,4.716662f,5.3772902f,5.3802605f,5.9974093f,5.7395196f)
                curveTo(6.617528f,6.098779f,7.382472f,6.098779f,8.002591f,5.7395196f)
                curveTo(8.622709f,5.3802605f,9.003205f,4.716662f,9.0f,4.0f)
                curveTo(9.003205f,3.283338f,8.622709f,2.6197395f,8.002591f,2.2604802f)
                curveTo(7.382472f,1.9012209f,6.617528f,1.9012209f,5.9974093f,2.2604802f)
                curveTo(5.3772902f,2.6197395f,4.996795f,3.283338f,5.0f,4.0f)
            }
}

public val LucideIcons.All.MouseLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MouseLeft: ImageVector
    @Composable get() = MouseLeftDefinition.asImageVector()
