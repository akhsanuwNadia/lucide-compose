package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FireExtinguisher") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,6.5f)
                lineTo(15.0f,3.0f)
                curveTo(15.0f,2.4477153f,14.552285f,2.0f,14.0f,2.0f)
                lineTo(12.0f,2.0f)
                curveTo(11.447715f,2.0f,11.0f,2.4477153f,11.0f,3.0f)
                lineTo(11.0f,6.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,18.0f)
                lineTo(17.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,3.0f)
                lineTo(15.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,3.0f)
                curveTo(7.6862917f,3.0f,5.0f,5.6862917f,5.0f,9.0f)
                lineTo(5.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,13.0f)
                lineTo(9.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,10.0f)
                curveTo(16.990152f,7.7978435f,15.202178f,6.0178485f,13.0f,6.0178485f)
                curveTo(10.797822f,6.0178485f,9.009849f,7.7978435f,9.0f,10.0f)
                lineTo(9.0f,20.0f)
                curveTo(9.0f,21.10457f,9.895431f,22.0f,11.0f,22.0f)
                lineTo(15.0f,22.0f)
                curveTo(16.10457f,22.0f,17.0f,21.10457f,17.0f,20.0f)
                close()
            }
}

public val LucideIcons.All.FireExtinguisherDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FireExtinguisher: ImageVector
    @Composable get() = FireExtinguisherDefinition.asImageVector()
