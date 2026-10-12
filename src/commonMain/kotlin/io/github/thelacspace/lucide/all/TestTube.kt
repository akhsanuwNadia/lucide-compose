package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TestTube") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.5f,2.0f)
                lineTo(14.5f,19.5f)
                curveTo(14.5f,20.9f,13.4f,22.0f,12.0f,22.0f)
                curveTo(10.6f,22.0f,9.5f,20.9f,9.5f,19.5f)
                lineTo(9.5f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,2.0f)
                lineTo(15.5f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f,16.0f)
                lineTo(9.5f,16.0f)
            }
}

public val LucideIcons.All.TestTubeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TestTube: ImageVector
    @Composable get() = TestTubeDefinition.asImageVector()
