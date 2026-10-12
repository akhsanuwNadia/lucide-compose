package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WheatOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,22.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,8.0)
                lineTo(14.829999923706055,9.170000076293945)
            }
            lucidePath(strokeWidth) {
                moveTo(3.4700000286102295,12.529999732971191)
                lineTo(5.0,11.0)
                lineTo(6.529999732971191,12.529999732971191)
                curveTo(7.8903489112854,13.895711898803711,7.8903489112854,16.104286193847656,6.529999732971191,17.469999313354492)
                lineTo(5.0,19.0)
                lineTo(3.4700000286102295,17.469999313354492)
                curveTo(2.109650135040283,16.104286193847656,2.109650135040283,13.895711898803711,3.4700000286102295,12.529998779296875)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                lineTo(7.470000267028809,8.529999732971191)
                curveTo(6.1096510887146,9.895711898803711,6.1096510887146,12.104287147521973,7.470000267028809,13.469999313354492)
                lineTo(9.0,15.0)
                lineTo(10.529999732971191,13.470000267028809)
                curveTo(11.079999923706055,12.920000076293945,11.40999984741211,12.220000267028809,11.510000228881836,11.5)
            }
            lucidePath(strokeWidth) {
                moveTo(10.90999984741211,5.260000228881836)
                curveTo(11.059999465942383,5.0,11.25,4.75,11.470000267028809,4.53000020980835)
                lineTo(13.0,3.0)
                lineTo(14.529999732971191,4.529999732971191)
                curveTo(15.77361011505127,5.779679775238037,15.893586158752441,7.75927734375,14.809999465942383,9.149999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,2.0)
                lineTo(22.0,2.0)
                lineTo(22.0,4.0)
                curveTo(22.0,6.209138870239258,20.209138870239258,8.0,18.0,8.0)
                lineTo(16.0,8.0)
                lineTo(16.0,6.0)
                curveTo(16.0,3.790860891342163,17.790861129760742,2.0,20.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.470000267028809,17.469999313354492)
                lineTo(13.0,19.0)
                lineTo(11.470000267028809,20.530000686645508)
                curveTo(10.104288101196289,21.890350341796875,7.895712852478027,21.890350341796875,6.53000020980835,20.530000686645508)
                lineTo(5.0,19.0)
                lineTo(6.529999732971191,17.469999313354492)
                curveTo(7.895712375640869,16.109649658203125,10.104287147521973,16.109649658203125,11.469999313354492,17.469999313354492)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                lineTo(15.470000267028809,16.530000686645508)
                curveTo(14.104288101196289,17.890350341796875,11.895712852478027,17.890350341796875,10.530000686645508,16.530000686645508)
                lineTo(9.0,15.0)
                lineTo(10.529999732971191,13.470000267028809)
                curveTo(11.063819885253906,12.93946361541748,11.754842758178711,12.59570598602295,12.5,12.489999771118164)
            }
            lucidePath(strokeWidth) {
                moveTo(18.739999771118164,13.09000015258789)
                curveTo(19.0,12.940000534057617,19.25,12.75,19.469999313354492,12.529999732971191)
                lineTo(21.0,11.0)
                lineTo(19.469999313354492,9.470000267028809)
                curveTo(18.220319747924805,8.22638988494873,16.240720748901367,8.106413841247559,14.84999942779541,9.190000534057617)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.WheatOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WheatOff: ImageVector
    @Composable get() = WheatOffDefinition.asImageVector()
