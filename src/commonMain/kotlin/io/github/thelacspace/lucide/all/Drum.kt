package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Drum") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(10.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,2.0)
                lineTo(14.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,13.399999618530273)
                lineTo(7.0,21.299999237060547)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,14.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,13.399999618530273)
                lineTo(17.0,21.299999237060547)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,9.0)
                lineTo(2.0,17.0)
                curveTo(2.02462100982666,19.752695083618164,6.494554042816162,21.977689743041992,12.0,21.977689743041992)
                curveTo(17.50544548034668,21.977689743041992,21.975379943847656,19.752695083618164,22.0,17.0)
                lineTo(22.0,9.0)
            }
}

public val LucideIcons.All.DrumDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Drum: ImageVector
    @Composable get() = DrumDefinition.asImageVector()
