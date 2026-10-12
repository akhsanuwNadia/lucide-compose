package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sandwich") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.37f,11.223f)
                lineTo(10.742f,4.4459996f)
                curveTo(11.475636f,3.852414f,12.5243635f,3.852414f,13.257999f,4.4459996f)
                lineTo(21.629f,11.223f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,15.0f)
                curveTo(21.552284f,15.0f,22.0f,15.447715f,22.0f,16.0f)
                lineTo(22.0f,18.0f)
                curveTo(22.0f,18.552284f,21.552284f,19.0f,21.0f,19.0f)
                lineTo(15.75f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,15.0f)
                curveTo(2.4477153f,15.0f,2.0f,15.447715f,2.0f,16.0f)
                lineTo(2.0f,18.0f)
                curveTo(2.0f,18.552284f,2.4477153f,19.0f,3.0f,19.0f)
                lineTo(12.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.67f,15.0f)
                lineTo(12.8f,19.6f)
                curveTo(13.224346f,19.91826f,13.757741f,20.054914f,14.282843f,19.9799f)
                curveTo(14.807945f,19.904884f,15.28174f,19.624348f,15.6f,19.2f)
                lineTo(18.75f,15.000001f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,11.0f)
                lineTo(21.0f,11.0f)
                lineTo(22.0f,11.0f)
                lineTo(22.0f,15.0f)
                lineTo(21.0f,15.0f)
                lineTo(3.0f,15.0f)
                lineTo(2.0f,15.0f)
                lineTo(2.0f,11.0f)
                lineTo(3.0f,11.0f)
                close()
            }
}

public val LucideIcons.All.SandwichDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sandwich: ImageVector
    @Composable get() = SandwichDefinition.asImageVector()
