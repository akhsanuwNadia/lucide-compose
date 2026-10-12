package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WandSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.639999389648438,3.640000104904175)
                lineTo(20.35999870300293,2.3600001335144043)
                curveTo(20.132732391357422,2.1303770542144775,19.823074340820312,2.001176118850708,19.5,2.001176118850708)
                curveTo(19.176923751831055,2.001176118850708,18.867265701293945,2.1303770542144775,18.639999389648438,2.3600001335144043)
                lineTo(2.359999895095825,18.639999389648438)
                curveTo(2.1303768157958984,18.867265701293945,2.001175880432129,19.176923751831055,2.001175880432129,19.5)
                curveTo(2.001175880432129,19.823074340820312,2.1303768157958984,20.132732391357422,2.359999895095825,20.35999870300293)
                lineTo(3.6399998664855957,21.639999389648438)
                curveTo(3.8659098148345947,21.87214469909668,4.176075458526611,22.00309944152832,4.5,22.00309944152832)
                curveTo(4.8239240646362305,22.00309944152832,5.134089946746826,21.87214469909668,5.359999656677246,21.639999389648438)
                lineTo(21.639999389648438,5.360000133514404)
                curveTo(21.87214469909668,5.134090423583984,22.00309944152832,4.823924541473389,22.00309944152832,4.5)
                curveTo(22.00309944152832,4.1760759353637695,21.87214469909668,3.865910053253174,21.639999389648438,3.640000104904175)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,7.0)
                lineTo(17.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,6.0)
                lineTo(5.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,14.0)
                lineTo(19.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(10.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,8.0)
                lineTo(3.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,16.0)
                lineTo(17.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,3.0)
                lineTo(9.0,3.0)
            }
}

public val LucideIcons.All.WandSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WandSparkles: ImageVector
    @Composable get() = WandSparklesDefinition.asImageVector()
