package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacVirgo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,5.5)
                curveTo(11.006155014038086,4.123652458190918,12.123638153076172,3.011155366897583,13.5,3.011155366897583)
                curveTo(14.876361846923828,3.011155366897583,15.993844985961914,4.123652458190918,16.0,5.5)
                lineTo(16.0,16.0)
                curveTo(16.0,18.761423110961914,18.238576889038086,21.0,21.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,11.5)
                curveTo(16.006155014038086,10.123652458190918,17.123638153076172,9.011155128479004,18.5,9.011155128479004)
                curveTo(19.876361846923828,9.011155128479004,20.993844985961914,10.123652458190918,21.0,11.5)
                lineTo(21.0,16.0)
                curveTo(21.0,18.761423110961914,18.761423110961914,21.0,16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,19.0)
                lineTo(6.0,6.0)
                curveTo(6.0,4.343145847320557,4.656854152679443,3.0,3.0,3.0)
                lineTo(3.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,5.5)
                curveTo(6.006155014038086,4.123652458190918,7.12363862991333,3.011155366897583,8.5,3.011155366897583)
                curveTo(9.876361846923828,3.011155366897583,10.993844985961914,4.123652458190918,11.0,5.5)
                lineTo(11.0,19.0)
            }
}

public val LucideIcons.All.ZodiacVirgoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacVirgo: ImageVector
    @Composable get() = ZodiacVirgoDefinition.asImageVector()
