package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BrickWallFire") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,3.0)
                lineTo(16.0,5.107000350952148)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,9.0)
                curveTo(18.0,12.0,19.5,12.5,20.5,13.5)
                curveTo(21.44207191467285,14.423151969909668,21.98121452331543,15.681153297424316,22.0,17.0)
                curveTo(21.987689971923828,19.752695083618164,19.752723693847656,21.977689743041992,17.0,21.977689743041992)
                curveTo(14.24727725982666,21.977689743041992,12.012310028076172,19.752695083618164,12.0,17.0)
                curveTo(12.0,16.700000762939453,12.0,16.399999618530273,12.100000381469727,16.100000381469727)
                curveTo(12.331644058227539,16.91066551208496,13.046788215637207,17.489004135131836,13.887974739074707,17.54593849182129)
                curveTo(14.729162216186523,17.602872848510742,15.515714645385742,17.126174926757812,15.85448169708252,16.354116439819336)
                curveTo(16.193248748779297,15.58205795288086,16.0114688873291,14.680469512939453,15.40000057220459,14.100000381469727)
                curveTo(13.0,11.5,16.0,9.0,17.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,8.27400016784668)
                lineTo(21.0,5.0)
                curveTo(21.0,3.895430564880371,20.104570388793945,3.0,19.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(8.937999725341797,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,15.0)
                lineTo(8.253000259399414,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(11.227999687194824,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,15.0)
                lineTo(8.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,3.0)
                lineTo(8.0,9.0)
            }
}

public val LucideIcons.All.BrickWallFireDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BrickWallFire: ImageVector
    @Composable get() = BrickWallFireDefinition.asImageVector()
