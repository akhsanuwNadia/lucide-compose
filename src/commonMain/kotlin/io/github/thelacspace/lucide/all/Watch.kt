package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Watch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,10.0)
                lineTo(12.0,12.199999809265137)
                lineTo(13.600000381469727,13.199999809265137)
            }
            lucidePath(strokeWidth) {
                moveTo(16.1299991607666,7.659999847412109)
                lineTo(15.319998741149902,3.609999656677246)
                curveTo(15.131261825561523,2.6597681045532227,14.288615226745605,1.9814373254776,13.319998741149902,1.9999996423721313)
                lineTo(10.639998435974121,1.9999996423721313)
                curveTo(9.671381950378418,1.9814373254776,8.8287353515625,2.6597681045532227,8.639998435974121,3.609999656677246)
                lineTo(7.85999870300293,7.659999847412109)
            }
            lucidePath(strokeWidth) {
                moveTo(7.880000114440918,16.360000610351562)
                lineTo(8.680000305175781,20.360000610351562)
                curveTo(8.86873722076416,21.310232162475586,9.711383819580078,21.988563537597656,10.680000305175781,21.970001220703125)
                lineTo(13.40000057220459,21.970001220703125)
                curveTo(14.368617057800293,21.988563537597656,15.211263656616211,21.310232162475586,15.40000057220459,20.360000610351562)
                lineTo(16.21000099182129,16.310001373291016)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                curveTo(5.990385055541992,14.149985313415527,7.131871223449707,16.14078140258789,8.992227554321289,17.21855926513672)
                curveTo(10.852583885192871,18.296337127685547,13.147416114807129,18.296337127685547,15.007772445678711,17.21855926513672)
                curveTo(16.86812973022461,16.14078140258789,18.009614944458008,14.149985313415527,18.0,12.0)
                curveTo(18.009614944458008,9.850014686584473,16.86812973022461,7.859218597412109,15.007772445678711,6.781440734863281)
                curveTo(13.147416114807129,5.703662395477295,10.852583885192871,5.703662395477295,8.992227554321289,6.781440734863281)
                curveTo(7.131871223449707,7.859218597412109,5.990385055541992,9.850014686584473,6.0,12.0)
            }
}

public val LucideIcons.All.WatchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Watch: ImageVector
    @Composable get() = WatchDefinition.asImageVector()
