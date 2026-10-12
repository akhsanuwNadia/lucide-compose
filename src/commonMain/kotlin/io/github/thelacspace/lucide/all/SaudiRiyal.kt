package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SaudiRiyal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,19.5f)
                lineTo(14.5f,20.7f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f,4.0f)
                lineTo(14.5f,15.22f)
                curveTo(14.500085f,15.52779f,14.641903f,15.818394f,14.884479f,16.007845f)
                curveTo(15.127054f,16.197296f,15.443358f,16.264486f,15.742f,16.19f)
                lineTo(20.0f,15.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.978f,19.351f)
                lineTo(8.526999f,17.987999f)
                curveTo(9.418168f,17.744997f,10.026994f,16.923311f,10.0f,16.0f)
                lineTo(10.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,10.0f)
                lineTo(4.0f,13.5f)
            }
}

public val LucideIcons.All.SaudiRiyalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SaudiRiyal: ImageVector
    @Composable get() = SaudiRiyalDefinition.asImageVector()
