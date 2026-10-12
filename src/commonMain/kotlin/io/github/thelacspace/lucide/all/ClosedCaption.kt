package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClosedCaption") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,9.170000076293945)
                curveTo(8.757190704345703,8.732803344726562,7.37457799911499,9.15760612487793,6.591653347015381,10.217203140258789)
                curveTo(5.8087286949157715,11.276800155639648,5.8087286949157715,12.723199844360352,6.591653347015381,13.782796859741211)
                curveTo(7.37457799911499,14.84239387512207,8.757190704345703,15.267196655273438,10.0,14.829999923706055)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,9.170000076293945)
                curveTo(15.757190704345703,8.732803344726562,14.374578475952148,9.15760612487793,13.591652870178223,10.217203140258789)
                curveTo(12.808728218078613,11.276800155639648,12.808728218078613,12.723199844360352,13.591652870178223,13.782796859741211)
                curveTo(14.374578475952148,14.84239387512207,15.757190704345703,15.267196655273438,17.0,14.829999923706055)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,5.0)
                lineTo(20.0,5.0)
                lineTo(22.0,5.0)
                lineTo(22.0,19.0)
                lineTo(20.0,19.0)
                lineTo(4.0,19.0)
                lineTo(2.0,19.0)
                lineTo(2.0,5.0)
                lineTo(4.0,5.0)
                close()
            }
}

public val LucideIcons.All.ClosedCaptionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClosedCaption: ImageVector
    @Composable get() = ClosedCaptionDefinition.asImageVector()
